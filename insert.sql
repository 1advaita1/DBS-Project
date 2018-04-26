use songs;
LOAD DATA LOCAL INFILE "C:/DBSproj/songinfo/fAlbum_year_concat.txt" INTO TABLE albums character set utf8 fields terminated by '\n'; 
LOAD DATA LOCAL INFILE "C:/DBSproj/songinfo/fsong_concat.txt" INTO TABLE song character set utf8 fields terminated by '\n'; 