package net.saddlercoms.lil.guestservices.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.saddlercoms.lil.guestservices.data.GuestRepository;
import net.saddlercoms.lil.guestservices.models.Guest;

@RestController
@RequestMapping("/guests")
public class GuestWebServices {
	private final GuestRepository repository;
	
	public GuestWebServices(GuestRepository repository) { this.repository = repository; } 
	
	@GetMapping 
	public Iterable<Guest> getAllGuests() { return this.repository.findAll(); } 
	
	@GetMapping("/{id}")
	public Guest getGuest(@PathVariable("id") long id) { return this.repository.findById(id).get();  }
}
