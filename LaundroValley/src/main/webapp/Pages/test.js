function addplan(){
	
	var planid=document.getElementById("id").value;
	var planamount=document.getElementById("amount").value;
	var plantype=document.getElementById("type").value;
	var apiEndpoint = "localhost:8089/addplan/"+planid+"/"+planamount+"/"+plantype;
	console.log(apiEndpoint);
	alert(planid+" "+planamount+" "+plantype);
	
	xmlhttp=new XMLHttpRequest();
	  jQuery.ajax({
          dataType: "json",
          url: apiEndpoint,
          async: false,
          context: document.body
       }).success(function (data) {
          alert(data);
       });
	
}