package com.github.timm.cucumber.generate;

import org.apache.maven.plugin.logging.Log;


public interface FileGeneratorConfig {

    boolean filterFeaturesByTags();

    Log getLog();

    String getFeaturesDirectory();

    String getEncoding();

    String getCucumberOutputDir();

    boolean useTestNG();

    String getNamingScheme();

    String getNamingPattern();
    
    boolean useReRun();

    boolean getFilterScenarioAndOutlineByLines();
    
    void setFilterScenarioAndOutlineByLines(boolean flag);
}
