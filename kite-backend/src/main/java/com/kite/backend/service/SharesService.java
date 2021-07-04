package com.kite.backend.service;

import com.kite.backend.exception.NotFoundException;
import com.kite.backend.model.Shares;
import com.kite.backend.repository.SharesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SharesService {

    private SharesRepository sharesRepository;

    public SharesService(SharesRepository sharesRepository) {
        this.sharesRepository = sharesRepository;
    }

    public Shares save(Shares shares) {
        return sharesRepository.save(shares);
    }

    public List<Shares> getShares() {
        return sharesRepository.findAll();
    }

    public void delete(long id) {
        Optional<Shares> trainerOptional = sharesRepository.findById(id);
        if (trainerOptional.isPresent()) {
            sharesRepository.deleteById(id);
        }
        throw new NotFoundException("ID " + id + "Not Found!");
    }

    public Shares getShare(long id) {
        Optional<Shares> trainerOptional = sharesRepository.findById(id);
        if (trainerOptional.isPresent()) {
            return sharesRepository.findById(id).get();
        }
        throw new NotFoundException("ID " + id + "Not Found!");
    }
}
