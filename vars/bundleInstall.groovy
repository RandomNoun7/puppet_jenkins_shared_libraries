import com.puppet.jenkinsSharedLibraries.bundleInstall

def call(String rubyVersion) {
  def bundle = new BundleInstall(rubyVersion)

  sh "${bundle.bundleInstall}"
}

def call (String rubyVersion, String gemfile) {
  def bundle = new BundleInstall(rubyVersion, gemfile)

  sh "${bundle.bundleInstall}"
}
