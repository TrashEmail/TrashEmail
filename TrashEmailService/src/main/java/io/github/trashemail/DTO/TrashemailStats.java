package io.github.trashemail.DTO;

import io.github.trashemail.utils.DaysAndEmailsCount;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class TrashemailStats {
    private Long numberOfUsers;
    private Long numberOfEmailsRegistered;
    private Map<String, Long> domainsToNumbers;
    private Long emailIdsCreatedToday;
    private List<Long> emailIdsCreatedInWeek;
    private String version;
    private Long numberOfEmailsProcessed;
    private Long totalNumberOfUsers;
    private List<DaysAndEmailsCount> cummulativeEmailsCountPerDay;
}
