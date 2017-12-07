package com.ayotta.marine.cucumber.stepdefs;

import com.ayotta.marine.MarineApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MarineApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
