def call(){
  dependencyCheck additionalArguments: '--scan ./', nvdCredentialsId: 'NVDkey', odcInstallation: 'OWASP'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
