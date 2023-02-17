package com.sample.blog.whysatatic;

import javax.servlet.http.HttpServletRequest;

public class ViewFindController {
    // 왜 상수는 static이 붙는 걸까?
    private final String CPTT_JUDGE_VIEW = "cpttJudgeView";
    private final String ADMIN_VIEW = "adminView";

    public String findView(HttpServletRequest request) {
        String fromRequestUri = request.getRequestURI();
        if (CPTT_JUDGE_VIEW.contains(fromRequestUri)) {
            return "nextCpttJudgePage";
        }
        return "default";
    }
}
