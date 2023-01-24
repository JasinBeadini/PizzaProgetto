package it.corso.pizzaservice.controller.impl;

import it.corso.pizzaservice.controller.ToppingController;
import it.corso.pizzaservice.dto.ToppingDTO;
import it.corso.pizzaservice.mapper.ToppingMapper;
import it.corso.pizzaservice.model.Topping;
import it.corso.pizzaservice.service.ToppingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/toppings")
@RequiredArgsConstructor
public class ToppingControllerImpl implements ToppingController {

    private final ToppingService toppingService;
    private final ToppingMapper toppingMapper;

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ToppingDTO save(@RequestBody ToppingDTO toppingDTO) {
        Topping _topping = toppingMapper.asEntity(toppingDTO);
        return toppingMapper.asDTO(toppingService.save(_topping));
    }

    @Override
    @GetMapping("/{id}")
    public ToppingDTO findById(@PathVariable Long id) {
        Topping _topping = toppingService.findById(id).orElse(null);
        return toppingMapper.asDTO(_topping);
    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        toppingService.deleteById(id);

    }

    @Override
    @GetMapping
    public List<ToppingDTO> findAll() {
        return toppingMapper.asDTOList(toppingService.findAll());
    }

    @Override
    @PutMapping("{id}")
    public ToppingDTO update(@RequestBody ToppingDTO toppingDTO,@PathVariable Long id) {
        Topping _topping = toppingMapper.asEntity(toppingDTO);
        return toppingMapper.asDTO(toppingService.update(_topping, id));
    }
}