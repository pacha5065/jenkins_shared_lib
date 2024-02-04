def call(){
    sh 'cd target'
    sh 'curl -X PUT -u admin:Manage1234 -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://15.207.14.231:8082/artifactory/example-repo-local/'
}
