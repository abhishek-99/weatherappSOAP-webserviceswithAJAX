/**
 * 
 */
function formatXml(xml) {
    var formatted = '';
    var reg = /(>)(<)(\/*)/g;
    xml = xml.replace(reg, '$1\r\n$2$3');
    var pad = 0;
    jQuery.each(xml.split('\r\n'), function(index, node) {
        var indent = 0;
        if (node.match( /.+<\/\w[^>]*>$/ )) {
            indent = 0;
        } else if (node.match( /^<\/\w/ )) {
            if (pad != 0) {
                pad -= 1;
            }
        } else if (node.match( /^<\w[^>]*[^\/]>.*$/ )) {
            indent = 1;
        } else {
            indent = 0;
        }

        var padding = '';
        for (var i = 0; i < pad; i++) {
            padding += '  ';
        }

        formatted += padding + node + '\r\n';
        pad += indent;
    });

    return formatted;
}

var xhtp;
function weather() {
	alert("script called");
	var cityname=document.getElementById("city").value;
		alert(cityname);
	var countryname=document.getElementById("country").value;
	var url="clientservlet?cityname="+cityname+"&countryname="+countryname;
	
	alert(countryname);
	alert(url);
	if(window.XMLHttpRequest)
		{
			xhtp= new XMLHttpRequest();
		}
	else if(window.ActiveXObject)
		{
			xhtp= new ActiveXObject("Microsoft.XMLHTTP")
		}
	try {
		xhtp.onreadystatechange=myfunction;
		xhtp.open("GET", url, true);
		xhtp.send();
	} catch (e) {
		alert("unable to connect");
	}
	function myfunction()
	{
		if(xhtp.readyState==4&&xhtp.status==200)
			{
				var result = xhtp.responseText;
			document.getElementById("output").innerHTML=formatXml(result);
			}
	}
}
