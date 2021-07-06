package com.kite.backend.dto;

import com.kite.backend.model.Shares;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SharesViewDTO {

    private Long id;

    private String header;

    private String content;

    private String comments;

    public SharesViewDTO(Shares shares) {
        this.id = shares.getId();
        this.header = shares.getHeader();
        this.content = shares.getContent();
        this.comments = shares.getComments();
    }

}
