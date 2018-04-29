$path=Get-Content "C:/DBSproj/songinfo/filepath.txt"

add-type -assembly presentationcore
$player = new-object system.windows.media.mediaplayer

$player.open("$path")
$status
$path

while(1)
{
$status=Get-Content "C:/DBSproj/status.txt"
If($status -eq "1") {$player.play()}
If($status -eq "0") {$player.pause()}

Start-Sleep -m 800
}
pause

#break, https://powershell.org/forums/topic/sleeping-within-a-loop/