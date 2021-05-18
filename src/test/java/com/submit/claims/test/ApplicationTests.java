/*package com.submit.claims.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.submit.claims.SubmitClaimsApplication;
import com.submit.claims.model.SubmitClaims;
import com.submit.claims.repository.SubmitClaimsRepository;
import com.submit.claims.service.SubmitClaimsService;


@RunWith(SpringRunner.class)

@SpringBootTest
public class ApplicationTests {


@Autowired 
private SubmitClaimsService submitclaimsService;

@MockBean
private SubmitClaimsRepository submitclaimsRepository;

@Before 
public void init()
{
	  MockitoAnnotations.initMocks(this);
	  }

@Test 
public void main()
{
	SubmitClaimsApplication.main(new String[] {});
	  }

@Test
public void createProductTest() 
{
	SubmitClaims product = new
			SubmitClaims(1,"prathyu","prathyu@gmail.com","8889997771","AAAAA4444W");
when(submitclaimsRepository.save(product)).thenReturn(product);
assertEquals(product, submitclaimsService.createProduct(product));

}
}*/
