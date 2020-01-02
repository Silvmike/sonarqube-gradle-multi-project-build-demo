package ru.test;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Arguments {

    /**
     * integers :)
     */
    private List<Integer> integers;

    /**
     * Dummy field. Since lombok should generate @Generated,
     * we shouldn't see it in coverage report.
     */
    private int someDummyFieldToCheckCoverageReport;

}
