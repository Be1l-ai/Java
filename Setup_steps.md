How to Set up java Environment on Vs code

1. Check for java using;
    java -version or javac -version
2. Download java if its missing using;
    sudo apt-get install openjdk-17-jdk -y
3. Recheck for java using step 1
4. Download Java Extention by Microsoft
5. Make a file using;
    mkdir [folder name]
6. Enter the folder in terminal using;
    cd [folder name]
7. Enter the folder on explorer and make a src/package folder
8. Create the main and methods, do the coding inside the package folder
9. Use the command to turn .java into .class (compile);
    javac [src or package name]/*.java
10. You can now run the main using;
    jave -cp src [main file name]