


$.ajax({
        url: 'msk/parts-brand',
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
						          url: 'msk/parts-models',
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
	  
	  console.log("selectedbrand======>"+selectedbrand);


	$.ajax({
        url: 'exists-partss',
        type: 'POST',
        dataType: 'text',
        data: {'brand_id':selectedbrand},
        success: function(responseText) {
      	  
      	  console.log("output========>"+responseText);
      	  
      	  var output=JSON.parse(responseText);
      	  
      	
      	 var availableTags = [];
	        
         $.each(output.nameeeeeee, function(key, value) {
           
             availableTags.push(value.nameeeeeee);
             
            
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
      
     