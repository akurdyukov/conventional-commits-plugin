package io.jenkins.plugins.conventionalcommits.process;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import hudson.Launcher;
import hudson.Proc;
import org.apache.commons.io.IOUtils;

/** This class runs a given command using ProcessBuilder. */
public class DefaultProcessHelper implements ProcessHelper {
  private final Launcher launcher;

  public DefaultProcessHelper(Launcher launcher) {
    this.launcher = launcher;
  }

  @Override
  public String runProcessBuilder(File directory, List<String> command)
      throws IOException, InterruptedException {

    Proc process = launcher.launch().cmds(command).readStderr().readStdout().pwd(directory).start();

    process.join();
    String results = IOUtils.toString(process.getStdout(), StandardCharsets.UTF_8);

    return results;
  }
}
