def call(String msg = 'deploy_ansible') {
echo "${msg}"
  withCredentials([string(credentialsId: 'tomcat_dev', variable: 'password')]){
    sh 'sshpass -p ${password} ssh -o StrictHostKeyChecking=no ansadmin@172.31.37.95 -C \"ansible-playbook /opt/playbooks/download.yml\"'
  
  }
}
