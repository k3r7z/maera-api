include .env

run: ## Start the containers
	docker compose up -d

stop: ## Stop the containers
	docker compose stop

restart: ## Restart the containers
	$(MAKE) stop && $(MAKE) run

build: ## Rebuilds all the containers
	docker compose stop && docker compose build

ssh-be: ## ssh's into the be container
	docker exec -it backend bash

ssh-db: ## ssh's into the db container
	docker exec -it database /bin/bash
