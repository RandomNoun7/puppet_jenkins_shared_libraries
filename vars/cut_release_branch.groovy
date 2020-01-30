def call(String version, String branch_from) {

  if (version =~ '^20[0-9]{2}[.]([0-9]*)[.]([0-9]*)$') {
    println "${version} is a valid version"
  } else {
    println "${version} is an invalid version"
    throw new Exception("Invalid version")
  }
  //Execute bash script, catch and print output and errors
  node {
    sh "curl -O https://raw.githubusercontent.com/puppetlabs/puppet_jenkins_shared_libraries/test/cut-release-work/vars/bash/cut_release_branch.sh"
    sh "chmod +x cut_release_branch.sh"
    sh "./cut_release_branch.sh $version $branch_from"
  }
}
