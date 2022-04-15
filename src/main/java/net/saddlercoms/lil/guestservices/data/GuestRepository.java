package net.saddlercoms.lil.guestservices.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.saddlercoms.lil.guestservices.models.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long>{

}
