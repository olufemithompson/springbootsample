package com.lqwd.coinproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.lqwd.coinproject.dto.CoinDTO;
import com.lqwd.coinproject.exceptions.RecordNotFoundException;
import com.lqwd.coinproject.model.Coin;
import com.lqwd.coinproject.service.CoinService;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

//@SpringBootTest
//@RunWith(SpringRunner.class)
public class CoinControllerTest {
	
//	MockMvc mockMvc;
//
//    @Autowired
//    protected WebApplicationContext wac;
//
//    @Autowired
//    CoinController bookController;
//    
//    @MockBean
//    CoinService bookService;
//
//
//    private List<CoinDTO> books;
//    
//
//    @Before
//    public void setup() throws Exception {
//        this.mockMvc = standaloneSetup(this.bookController).build();
//        books = new ArrayList<CoinDTO>();
//        CoinDTO bookDTO= new CoinDTO();
//        bookDTO.setAuthor("Author 1");
//        bookDTO.setName("Name 1");
//        bookDTO.setTotalPages(3);
//        books.add(bookDTO);
//        
//    }
//
//    @Test
//    public void testListBooks() throws Exception {
//        // Mocking service
//        when(bookService.list()).thenReturn(books);
//        
//        mockMvc.perform(get("/books").contentType(MediaType.APPLICATION_JSON))
//            .andExpect(status().isOk())
//            .andExpect(jsonPath("$[0].name", is("Name 1")));
//    }
//    
//    @Test
//    public void testFindBook() throws Exception {
//        // Mocking service
//        when(bookService.findBook(1L)).thenReturn(books.get(0));
//        
//        mockMvc.perform(get("/books/1").contentType(MediaType.APPLICATION_JSON))
//            .andExpect(status().isOk())
//            .andExpect(jsonPath("$.name", is("Name 1")));
//    }
//
//    @Test
//    public void testUpdateBook() throws Exception {
//    	
//    	
//        // Mocking service
//    	books.get(0).setName("Name 2");
//        when(bookService.updateCoin(1L, books.get(0))).thenReturn(books.get(0));
//        when(bookService.updateCoin(2L, books.get(0))).thenThrow(RecordNotFoundException.class);
//        
//        
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
//        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
//        String requestJson=ow.writeValueAsString( books.get(0) );
//        
//        
//        mockMvc.perform(put("/books/update/1").content(requestJson).contentType(MediaType.APPLICATION_JSON))
//        .andExpect(status().isOk())
//        .andExpect(jsonPath("$.name", is("Name 2")));
//        
//        mockMvc.perform(put("/books/update/2").content(requestJson).contentType(MediaType.APPLICATION_JSON))
//        .andExpect(status().is4xxClientError())
//        .andExpect(jsonPath("$.message", is("Could not find record")));
//        
//        
//        
//        
//        
//        
//       
//    }

}
