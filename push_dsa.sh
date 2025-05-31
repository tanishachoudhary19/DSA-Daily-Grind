#!/bin/bash

# Ask for commit message
echo "Enter commit message:"
read msg

# Stage all changes
git add .

# Commit with message
git commit -m "$msg"

# Pull remote changes with rebase
git pull origin main --rebase

# Push to GitHub
git push origin main

echo "✅ All done! Changes pushed successfully!"
