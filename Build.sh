echo "Building the Project :"  
date +'%d/%m/%Y %H:%M:%S'

#Syntax to define a string variable
str='Current date is : dd=$(date -v -1d '+%m-%d-%y')
echo $str
