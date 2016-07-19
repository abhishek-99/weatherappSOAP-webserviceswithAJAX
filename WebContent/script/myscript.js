/**
 * 
 */
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
