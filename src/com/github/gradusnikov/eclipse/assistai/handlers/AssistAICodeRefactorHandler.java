package com.github.gradusnikov.eclipse.assistai.handlers;

import com.github.gradusnikov.eclipse.assistai.prompt.JobFactory.JobType;

public class AssistAICodeRefactorHandler extends AssistAIHandlerTemplate
{
    public AssistAICodeRefactorHandler()
    {
        super(JobType.REFACTOR);
    }
}
