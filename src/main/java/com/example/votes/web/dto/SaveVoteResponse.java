package com.example.votes.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SaveVoteResponse {
    private boolean isSaved;
}
