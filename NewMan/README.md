# NewMan

## install package
npm i newman-run and npm i newman-reporter-htmlextra

## Run
Folder (New Man Run) execute (npx newman run ./collections/newManCollection.postman_collection.json -e ./environment/locale.postman_environment.json --reporters=cli,htmlextra)