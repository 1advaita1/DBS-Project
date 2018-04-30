$path=Get-Content "C:/DBSproj/finalsong.txt"
start "C:/DBSproj/play.bat"
add-type -assembly presentationcore
$player = new-object system.windows.media.mediaplayer

$player.open("$path")
$player.play()
$path

while(1)
{

$status=Get-Content "C:/DBSproj/status.txt"
If($status -eq "1") {$player.play()}
If($status -eq "0") {$player.pause()}

If($status -eq "3") {exit}

Start-Sleep -m 100
}
pause

#break, https://powershell.org/forums/topic/sleeping-within-a-loop/