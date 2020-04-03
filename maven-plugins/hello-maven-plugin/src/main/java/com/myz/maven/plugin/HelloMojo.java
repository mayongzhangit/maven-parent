package com.myz.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Execute;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author yzMa
 * @desc
 * @date 2020/4/3 10:59 PM
 * @email 2641007740@qq.com
 */
@Mojo(name = "hello")
public class HelloMojo extends AbstractMojo {

    @Parameter(property = "name",defaultValue = "world")
    private String name;

    public void execute() throws MojoExecutionException, MojoFailureException {

        getLog().info("hello "+name+" in maven plugin");
    }
}
