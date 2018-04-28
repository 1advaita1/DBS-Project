use songs;
LOAD DATA LOCAL INFILE "C:/DBSproj/songinfo/fAlbum_year_concat.txt" INTO TABLE albums character set utf8 fields terminated by '\n'; 
LOAD DATA LOCAL INFILE "C:/DBSproj/songinfo/fGenre.txt" INTO TABLE genres character set utf8 ;
LOAD DATA LOCAL INFILE "C:/DBSproj/songinfo/fArtists.txt" INTO TABLE artists character set utf8; 

LOAD DATA LOCAL INFILE "C:/DBSproj/songinfo/fsong_concat.txt" INTO TABLE song character set utf8 fields terminated by '\n'; 
LOAD DATA LOCAL INFILE "C:/DBSproj/songinfo/fadd_genre_concat.txt" INTO TABLE add_genre character set utf8 fields terminated by '\n'; 
LOAD DATA LOCAL INFILE "C:/DBSproj/songinfo/fadd_artist_concat.txt" INTO TABLE add_artist character set utf8 fields terminated by '\n'; 

