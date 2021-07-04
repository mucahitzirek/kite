package com.kite.backend.controller;

import com.kite.backend.dto.SharesViewDTO;
import com.kite.backend.model.Shares;
import com.kite.backend.service.SharesService;
import com.kite.backend.shared.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/1.0/")
public class SharesController {

    @Autowired
    private SharesService sharesService;

    @PostMapping("/shares")
    public SharesViewDTO create(@RequestBody Shares shares) {
        return new SharesViewDTO(sharesService.save(shares));
    }

    @GetMapping("/shares")
    public List<SharesViewDTO> getShares() {
        return sharesService.getShares().stream().map(SharesViewDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/shares/{id:[0-9]+}")
    public ResponseEntity<SharesViewDTO> getShare(@PathVariable long id) {
        final Shares shares = sharesService.getShare(id);
        return ResponseEntity.ok(new SharesViewDTO(shares));
    }

    @DeleteMapping("/shares/{id:[0-9]+}")
    public ResponseEntity<?> delete(@PathVariable long id) {
        sharesService.delete(id);
        return ResponseEntity.ok(new GenericResponse("ID " + id + "Share Deleted"));
    }

}
