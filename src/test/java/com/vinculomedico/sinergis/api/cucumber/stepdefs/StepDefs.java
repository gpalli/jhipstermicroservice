package com.vinculomedico.sinergis.api.cucumber.stepdefs;

import com.vinculomedico.sinergis.api.JhipstermicroserviceApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipstermicroserviceApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
