package io.jenkins.plugins.conventionalcommits.process;

import static org.hamcrest.MatcherAssert.assertThat;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.FilePath;
import hudson.Launcher;
import hudson.Proc;
import hudson.remoting.Channel;
import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public class ProcessUtilTest {
  @Rule
  public TemporaryFolder rootFolder = new TemporaryFolder();

//  @Test
//  public void shouldExecuteACommand() throws Exception {
//    // Given : A command
//
//    // When : Call the execute command
//    String result = ProcessUtil.execute(rootFolder.newFolder("foo"), "git", "--version");
//
//    // Then : The command was executed
//    assertThat(result, CoreMatchers.containsString("git version"));
//  }

}