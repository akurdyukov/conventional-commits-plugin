package io.jenkins.plugins.conventionalcommits.process;

import java.io.File;
import java.io.IOException;
import java.util.List;

/** Interface intended to run CLI commands using ProcessBuilder. */
public interface ProcessHelper {
  /** Runs command in given working directory */
  String runProcessBuilder(File directory, List<String> command)
      throws IOException, InterruptedException;
}
