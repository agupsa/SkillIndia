
function sortProperties(obj, isNumericSort)
{
	isNumericSort=isNumericSort || false; // by default text sort
	var sortable=[];
	for(var key in obj)
		if(obj.hasOwnProperty(key))
			sortable.push([key, obj[key]]);
	if(isNumericSort)
		sortable.sort(function(a, b)
		{
			return a[1]-b[1];
		});
	else
		sortable.sort(function(a, b)
		{
			var x=a[1].toLowerCase(),
				y=b[1].toLowerCase();
			return x<y ? -1 : x>y ? 1 : 0;
		});
	return sortable; // array in format [ [ key1, val1 ], [ key2, val2 ], ... ]
}

$(document).ready(function(){
	console.log("ready");
	 $.getJSON("Bootstrap/JSON/courses.json", function(json){
		 
		var domainObj = {
				"394":"Agriculture",
				"893":"Automotive",
				"449":"Electronics",
				"259":"Handicrafts",
				"121":"Healthcare",
				"438":"IT",
				"975":"Life Science",
				"976":"Logistics",
				"834":"Media and Entertainment",
				"651":"Mining",
				"602":"Plumbing",
				"218":"Retail",
				"774":"Telecom",
				"866":"Tourism"
				};
		
		var domainArr = sortProperties(domainObj,false);
	 	var domainStr = "";
	    for(var k in domainArr){
	    	domainStr=domainStr + '<option value="'+domainArr[k][0]+'">'+domainArr[k][1]+'</option>\n';    	
	    }
	    console.log(domainStr);
	    
	    var courseArr = json["Agriculture"];
	    var courseStr = "";
	    for(var i in courseArr){
	    	courseStr = courseStr + '<option value="'+courseArr[i][0]+'">'+courseArr[i][1]+'</option>\n';
	    }
	    
	 	$("#domain-select").html(domainStr);
	 	$("#course-select").html(courseStr);
	 	
	 	$("#domain-select").change(function(){
	 		console.log("aa rrha hu");
	 		var domain = $("#domain-select").val();
	 		console.log(domainObj);
	 		var domain = domainObj[domain];
	 		console.log(domain);
	 		courseArr = json[domain];
	 		var courseStr = "";
		    for(var i in courseArr){
		    	courseStr = courseStr + '<option value="'+courseArr[i][0]+'">'+courseArr[i][1]+'</option>\n';
		    }
		    console.log(courseStr);
	 		$("#course-select").html(courseStr);
	 	});
	 });
})
