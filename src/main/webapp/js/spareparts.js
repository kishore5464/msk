


$.ajax({
        url: 'msk/check-brand-stock',
        method : 'post',
        datatype: 'text',
        success: function(response) {

        	
          var output = JSON.parse(response);

          
          
          $.each(output.data.brands, function(key, value) {
            


            $('#car_brands').append($("<option></option>").attr("value", key).val(value.brand_id).text(value.brand));

          });
          
          $('.brandlist').selectpicker('refresh');
          

        },
        error: function() {
          console.log("Error AJax")
        }
      })
      
      
      
      $(document).on("change",".brandlist",function(){
					  		  
							  var selectedbrand=$(this).val();
							  
							  console.log("selectedbrand======>"+selectedbrand);
	
							  $('#car_modals')
							    .find('option')
							    .remove()
							    .end()
							    .append('<option value="" selected disabled>Select Modal</option>')
							    .val('whatever');
			  
							$.ajax({
						          url: 'msk/check-model-stock',
						          type: 'POST',
						          dataType: 'text',
						          data: {'brand_id':selectedbrand},
						          success: function(responseText) {
						        	  
						        	  console.log("output========>"+responseText);
						        	  
						        	  var output=JSON.parse(responseText);
						        	  
						        	
						          	             
						           $.each(output.data.models, function(key, value) {   
						            	 
						       		  $('#car_modals').append($("<option></option>").attr("value",key).val(value.model_id).text(value.model));
						       		 
						       		
						            
						          }); 
						           $('.modallist').selectpicker('refresh');
						      
						          },
						          error: function() {
						          	console.log("error ajax");
						          	
						          }
						      });
						  
						  });



$(document).on("change",".modallist",function(){
	  
	  var selectedbrand=$(this).val();
	  
	  console.log("modal selectedbrand======>"+selectedbrand);


	$.ajax({
        url: 'msk/check-part-stock',
        type: 'POST',
        dataType: 'text',
        data: {'model_id':selectedbrand},
        success: function(responseText) {
  	  
      	  var output=JSON.parse(responseText);
   	  
     	var availableTags = [];
	        
         $.each(output.data.parts, function(key, value) {
           
            availableTags.push(value);
             
        	 console.log("eeeee------>"+value);
            
           });
         
        
         $( ".parts_name" ).autocomplete({
             source: availableTags
           });
         
    
        },
        error: function() {
        	console.log("error ajax");
        	
        }
    });

});


$(document).on("click",".chk_stock",function(){
	
	
	
	
	$.ajax({
        url: 'msk/exists-parts',
        type: 'POST',
        dataType: 'text',
        data: {'model_id':$('.modallist').val(),'part':$('.parts_name').val()},
        success: function(responseText) {
      	  
      	  console.log("output========>"+responseText);
      	 var output=JSON.parse(responseText);
      	 
      	 console.log("output====>"+output.data.spare_parts);
      	 
         if(output.data.spare_parts == "empty"){
        	 
        	 $('.disableoption').removeAttr("disabled");
        	 
         }
         else{
        	 $('.disableoption').removeAttr("disabled");
        	 
        	 
        	 
         }
    
        },
        error: function() {
        	console.log("error ajax");
        	
        }
    });
	
});


      
     