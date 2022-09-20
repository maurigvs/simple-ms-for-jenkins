package br.edu.maurigvs.simplemsforjenkins.services;

import br.edu.maurigvs.simplemsforjenkins.entities.Product;
import br.edu.maurigvs.simplemsforjenkins.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product save(Product product){
        return repository.save(product);
    }

    public List<Product> listAll(){
        return repository.findAll();
    }

    public Product getById(Long id){
        return repository.findById(id).get();
    }

    public Product update(Product product){
        Product productToUpdate = getById(product.getId());
        updateProductData(productToUpdate, product);
        return repository.save(productToUpdate);
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
    private void updateProductData(Product productToUpdate, Product product) {
        if(!(product.getName() == null) && product.getName().isBlank()) productToUpdate.setName(product.getName());
        if(!(product.getPrice() == null)) productToUpdate.setPrice(product.getPrice());
    }
}
