cd "C:/DBSproj"
start encode.ps1
mysql -u root --password=database -e "source C:/DBSproj/insert.sql"
pause

