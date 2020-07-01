import com.puppet.jenkinsSharedLibraries.bundleInstall

def call(String rubyVersion, String bundleExecCommand) {
  def bundle = new BundleExec(rubyVersion, bundleExecCommand)

  sh "${bundle.bundleExec}"
}
