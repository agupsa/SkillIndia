/**
 * 
 */
//console.log("helo");
$(document).ready(function(){
	console.log("ready");
	 $.getJSON("Bootstrap/JSON/state.json", function(json){
	 	console.log(json);
		var arr = [];
	 	var states = "";
	    for(var k in json){
	    	states=states + '<option val="'+k+'">'+k+'</option>';    	
	    }
	    var cities = "";
	    cityArr = json["Choose.."];
	    for(var i in cityArr){
	    	cities = cities + '<option value="'+cityArr[i]+'">'+cityArr[i]+'</option>';
	    }
    	//console.log(cities);
	    //console.log(states);
	 	$("#state-select").html(states);
	 	$("#city-select").html(cities);
	 	
	 	$("#state-select").change(function(){
	 		var state = $("#state-select").val();
	 		var cities = "";
	 		cityArr = json[state];
	 		for(var i in cityArr){
		    	cities = cities + '<option value="'+cityArr[i]+'">'+cityArr[i]+'</option>';
		    }
	 		$("#city-select").html(cities);
	 	});
	 });
})
