/* (C)2022 */
package com.github.manikmagar.maven.versioner.mojo;

import com.github.manikmagar.maven.versioner.VersionConfig;
import com.github.manikmagar.maven.versioner.git.JGitVersioner;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Generate a version from git commit history and prints it to maven build logs.
 */
@Mojo(name = "print", defaultPhase = LifecyclePhase.VALIDATE)
public class Print extends AbstractVersionerMojo {
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info(new JGitVersioner(new VersionConfig()).version().toString());
	}
}
