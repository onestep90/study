# Hadoop
## 1. Env
* Ubuntu linux 20.04
* Hadoop 3.2.1 (stable)
## 2. Install Sequence
1. Install OpenJDK on Ubuntu
2. Set Up a Non-Root User for Hadoop Environment
3. Download and Install Hadoop on Ubuntu
4. Single Node Hadoop Deployment (Pseudo-Distributed Mode)
## 3. Ref
*  https://hadoop.apache.org/docs/stable/hadoop-project-dist/hadoop-common/SingleCluster.html
* https://phoenixnap.com/kb/install-hadoop-ubuntu<br><br><br>

# Install Sequence
## 1. Install OpenJDK on Ubuntu
```zsh
# Update apt
sudo apt update

# Install open jdk
sudo apt install openjdk-8-jdk -y

# Check installing java has been complete
java -version; javac -version
```
![check_java](./img/check_java.png)

## 2. Set Up a Non-Root User for Hadoop Environment
```zsh
# Install openssh server&client
sudo apt install openssh-server openssh-client -y

# Create non-root user(hdoop) for hadoop
sudo adduser hdoop
sudo usermod -a -G sudo hdoop # add sudo authority
su hdoop

# Enable Passwordless SSH for Hadoop User
ssh-keygen -t rsa -P '' -f ~/.ssh/id_rsa
cat ~/.ssh/id_rsa.pub >> ~/.ssh/authorized_keys

# Change mode so that only owner can read&write 
chmod 0600 ~/.ssh/authorized_keys
ssh localhost
```
## 3. Download and Install Hadoop on Ubuntu From Hadoop Official Web Page
![hadoop_officialweb](./img/hadoop_officialweb.png)
```zsh
# Binary download for Hadoop Version 3.2.1
wget https://downloads.apache.org/hadoop/common/hadoop-3.2.1/hadoop-3.2.1.tar.gz

tar xzf hadoop-3.2.1.tar.gz
```
## 4. Single Node Hadoop Deployment (Pseudo-Distributed Mode)
I will set up pseudo-distributed mode. A Hadoop environment is configure by editing a set of configuration files: <br>
* bashrc
* hadoop-env.sh
* core-site.xml
* hdfs-site.xml
* marped-site.xml
* yarn-site.xml

```zsh
# .bashrc
sudo vi .bashrc

# Hadoop Related Options
# Adding the following content to the end of the file
export HADOOP_HOME=/home/hdoop/hadoop-3.2.1
export HADOOP_INSTALL=$HADOOP_HOME
export HADOOP_MAPRED_HOME=$HADOOP_HOME
export HADOOP_COMMON_HOME=$HADOOP_HOME
export HADOOP_HDFS_HOME=$HADOOP_HOME
export YARN_HOME=$HADOOP_HOME
export HADOOP_COMMON_LIB_NATIVE_DIR=$HADOOP_HOME/lib/native
export PATH=$PATH:$HADOOP_HOME/sbin:$HADOOP_HOME/bin
export HADOOP_OPTS="-Djava.library.path=$HADOOP_HOME/lib/native"
```

```zsh
# hadoop-env.sh
sudo vi $HADOOP_HOME/etc/hadoop/hadoop-env.sh

# Uncomment the $JAVA_HOME variable and add the full path to the OpenJDK installation on your system
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64

# If you don't know path
which javac
readlink -f /usr/bin/javac
```
![readlink](./img/readlink.PNG)




