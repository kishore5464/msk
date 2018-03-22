


$.ajax({
        url: 'msk/parts-brand',
        method : 'post',
        datatype: 'text',
        success: function(response) {

        	console.log("RESPONSE===========>"+response);
        	
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
      
     