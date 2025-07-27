include .env

run: ## Start the containers
	docker compose up -d --remove-orphans

stop: ## Stop the containers
	docker compose stop

restart: ## Restart the containers
	$(MAKE) stop && $(MAKE) run

build: ## Rebuilds all the containers
	docker compose stop && docker compose build && docker compose up -d --remove-orphans

ssh-be: ## ssh's into the be container
	docker exec -it backend bash

ssh-db: ## ssh's into the db container
	docker exec -it database /bin/bash

logs-be: ## Show logs for the be backend container
	docker compose logs backend -f backend