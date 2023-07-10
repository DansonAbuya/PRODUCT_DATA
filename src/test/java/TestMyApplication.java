import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.danapps.MyBatisConfig;
import com.danapps.controller.ProductController;
import com.danapps.model.Product;
import com.danapps.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestMyApplication {
	@Mock
	public ProductController productController;
		
	@InjectMocks
	public  ProductService productService;
	@InjectMocks
	public MyBatisConfig mybatisConfig;
	
	

    @Mock
    private ObjectMapper productmapper;
    
	
	
	public TestMyApplication() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	@SuppressWarnings("null")
	@Test
	public  void getAllProductsTest() { 
		List<Product> products =productService.getAllProducts();
		
				assertNotNull(products);
		        Assertions.assertEquals(2, products.size());
		        
		        return;
		        
	
	}
	@Test
	public void testcalculateTotal() {
		double totalPrice =productService.calculateTotalPrice();
		assertEquals(850.0,totalPrice);
		
		return;
	}
	
	
	
	
	

}
