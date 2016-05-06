package com.github.temyers.generate;

import org.apache.maven.plugin.logging.Log;

import java.io.File;

public interface FileGeneratorConfig {
    boolean filterFeaturesByTags();

    Log getLog();

    File getFeaturesDirectory();

    String getEncoding();

    String getCucumberOutputDir();

    boolean useTestNG();

    boolean useReRun();

    String getNamingScheme();
}
