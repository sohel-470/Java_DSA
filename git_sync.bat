@echo off
cd /d C:\Users\monda\IdeaProjects\Java_DSA

echo Checking Git status...
git status

echo Pulling latest changes from GitHub...
git pull origin main

echo Checking for uncommitted changes...
git status

:: If there are no changes, exit the script
git diff-index --quiet HEAD --
IF %ERRORLEVEL% == 0 (
    echo No changes detected. Exiting...
    pause
    exit /b
)

echo Adding all changes...
git add .

echo Committing changes...
set /p commit_msg="Updated code from desktop"
git commit -m "%commit_msg%"

echo Pushing changes to GitHub...
git push origin main

echo Sync completed! ✅
pause
