package vn.edu.hau.pizzaexpress.controller.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.edu.hau.pizzaexpress.model.Contact;
import vn.edu.hau.pizzaexpress.service.ContactService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@RequiredArgsConstructor
@Controller
public class ContactController {

	public final ContactService contactService;

//    @RequestMapping(value = "/contact", method = RequestMethod.GET)
//    public String contact (final Model model){
//        model.addAttribute("contact", new Contact());
//        return "contact";
//    }

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contacthaha (final Model model){

		return "contact";
	}

	@RequestMapping(value = {"/contactUs"}, method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> ajax_contact(final Model model,
															final @RequestBody Contact contact){
		contactService.save(contact);
		//Trả về kết quả
		Map<String, Object> jsonResult = new HashMap<String, Object>();
		jsonResult.put("StatusCode", 200);
		jsonResult.put("StatusMessage", "Cảm ơn bạn " + contact.getName() + "đã liên hệ cho chúng tôi");

		return ResponseEntity.ok(jsonResult);

	}



}
