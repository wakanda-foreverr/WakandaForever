import DataRepository from "../repositories/dataRepository";

const repositories = {
  data: DataRepository
};

export const RepositoryFactory = {
    get: name => repositories[name]
};
