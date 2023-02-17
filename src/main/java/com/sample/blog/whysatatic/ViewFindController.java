package com.sample.blog.whysatatic;

import javax.servlet.http.HttpServletRequest;

public class ViewFindController {
    private final String COMPETITION_ADMIN_VIEW = "competitionAdminView";

    public String findView(HttpServletRequest request) {
        String fromRequestUri = request.getRequestURI();
        String COMPETITION_JUDGE_VIEW = "competitionJudgeView";
        if (COMPETITION_JUDGE_VIEW.contains(fromRequestUri)) {
            return "nextCompetitionJudgePage";
        }
        return "default";
    }
}
